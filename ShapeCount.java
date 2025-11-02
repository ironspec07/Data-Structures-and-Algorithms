import java.util.*;

public class ShapeCount {


    static class Range implements Comparable<Range> {
        long startPoint, endPoint;

        Range(long start, long end) {
            this.startPoint = start;
            this.endPoint = end;
        }

        @Override
        public int compareTo(Range other) {
            return Long.compare(this.startPoint, other.startPoint);
        }
    }


    static List<Range> comOLR(List<Range> ranges) {
        if (ranges.isEmpty()){
            return new ArrayList<>();
        } 
        Collections.sort(ranges);
        List<Range> merged = new ArrayList<>();
        Range current = ranges.get(0);
        for (int i = 1; i < ranges.size(); i++) {
            Range next = ranges.get(i);
            if (next.startPoint <= current.endPoint) {
                current.endPoint = Math.max(current.endPoint, next.endPoint);
            } else {
                merged.add(current);
                current = next;
            }
        }
        merged.add(current);
        return merged;
    }


    static class HorLine {
        long yC, leftBound, rightBound;

        HorLine(long y, long l, long r) {
            this.yC = y;
            this.leftBound = l;
            this.rightBound = r;
        }
    }


    static class VerLine {
        long xC, bottomBound, topBound;

        VerLine(long x, long b, long t) {
            this.xC = x;
            this.bottomBound = b;
            this.topBound = t;
        }
    }

    static List<HorLine> buildHorLines(TreeMap<Long, List<Range>> horMap) {
        List<HorLine> horLines = new ArrayList<>();
        for (Map.Entry<Long, List<Range>> entry : horMap.entrySet()) {
            long y = entry.getKey();
            List<Range> merged = comOLR(entry.getValue());
            for (Range range : merged) {
                horLines.add(new HorLine(y, range.startPoint, range.endPoint));
            }
        }
        return horLines;
    }


    static List<VerLine> buildVerLines(TreeMap<Long, List<Range>> verMap) {
        List<VerLine> verLines = new ArrayList<>();
        for (Map.Entry<Long, List<Range>> entry : verMap.entrySet()) {
            long x = entry.getKey();
            List<Range> merged = comOLR(entry.getValue());
            for (Range range : merged) {
                verLines.add(new VerLine(x, range.startPoint, range.endPoint));
            }
        }
        return verLines;
    }


    static long[][] createIntersectionMask(List<VerLine> vLines, List<HorLine> hLines) {
        int numVer = vLines.size();
        int numHor = hLines.size();
        int mWidth = (numHor + 63) / 64;  
        long[][] intersecM = new long[numVer][mWidth];

        for (int i = 0; i < numVer; i++) {
            VerLine vert = vLines.get(i);
            for (int j = 0; j < numHor; j++) {
                HorLine horiz = hLines.get(j);
                if (vert.bottomBound <= horiz.yC && horiz.yC <= vert.topBound &&
                    horiz.leftBound <= vert.xC && vert.xC <= horiz.rightBound) {
                    int block = j / 64;
                    int offset = j % 64;
                    intersecM[i][block] |= (1L << offset);
                }
            }
        }
        return intersecM;
    }

    static long calIntersecCount(List<VerLine> vLines, long[][] intersecM) {
        int numVer = vLines.size();
        int mWidth = intersecM[0].length;
        long totalCount = 0;

        for (int i = 0; i < numVer; i++) {
            for (int j = i + 1; j < numVer; j++) {
                long comIntersec = 0;
                for (int block = 0; block < mWidth; block++) {
                    long bitIntersec = intersecM[i][block] & intersecM[j][block];
                    comIntersec += Long.bitCount(bitIntersec);
                }
                if (comIntersec >= 2) {
                    totalCount += comIntersec * (comIntersec - 1) / 2;
                }
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();

        TreeMap<Long, List<Range>> horizontalMap = new TreeMap<>();
        TreeMap<Long, List<Range>> verticalMap = new TreeMap<>();

        for (int i = 0; i < numLines; i++) {
            long x1 = sc.nextLong();
            long y1 = sc.nextLong();
            long x2 = sc.nextLong();
            long y2 = sc.nextLong();

            if (y1 == y2) {  
                if (x1 > x2) {
                    long swap = x1;
                    x1 = x2;
                    x2 = swap;
                }
                horizontalMap.computeIfAbsent(y1, k -> new ArrayList<>()).add(new Range(x1, x2));
            } else {  
                if (y1 > y2) {
                    long swap = y1;
                    y1 = y2;
                    y2 = swap;
                }
                verticalMap.computeIfAbsent(x1, k -> new ArrayList<>()).add(new Range(y1, y2));
            }
        }


        List<HorLine> horizontalLines = buildHorLines(horizontalMap);
        List<VerLine> verticalLines = buildVerLines(verticalMap);


        long[][] intersectionMask = createIntersectionMask(verticalLines, horizontalLines);


        long result = calIntersecCount(verticalLines, intersectionMask);
        System.out.println(result);

        sc.close();
    }
}
