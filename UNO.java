import java.util.*;

public class UNO {
    static class UnionFind {
        private int[] parent;

        public UnionFind(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y) {
            int rX = find(x);
            int rY = find(y);
            if (rX != rY) {
                parent[rY] = rX;
            }
        }
    }

    static class Grp {
        ArrayList<Integer> memb;
        int tSkill;
        int size;

        public Grp(ArrayList<Integer> memb, int[] skills) {
            this.memb = memb;
            this.size = memb.size();
            this.tSkill = 0;
            for (int mem : memb) {
                this.tSkill += skills[mem];
            }
        }
    }

    private static Map<String, Integer> bIdMap(String[] names) {
        Map<String, Integer> id = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            id.put(names[i], i);
        }
        return id;
    }

    private static UnionFind pF(int n, int f, Scanner sc, Map<String, Integer> id) {
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < f; i++) {
            String a = sc.next();
            String b = sc.next();
            uf.union(id.get(a), id.get(b));
        }
        return uf;
    }

    private static ArrayList<Grp> formGrps(int n, UnionFind uf, int[] skills) {
        Map<Integer, ArrayList<Integer>> clust = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = uf.find(i);
            clust.computeIfAbsent(root, k -> new ArrayList<>()).add(i);
        }
        ArrayList<Grp> groups = new ArrayList<>();
        for (ArrayList<Integer> clus : clust.values()) {
            groups.add(new Grp(clus, skills));
        }
        return groups;
    }

    private static ArrayList<ArrayList<Integer>> bRG(int r, Scanner sc, Map<String, Integer> id, UnionFind uf, ArrayList<Grp> groups) {
        int m = groups.size();
        ArrayList<ArrayList<Integer>> rival = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            rival.add(new ArrayList<>());
        }
        Map<Integer, Integer> groupIndex = new HashMap<>();
        for (int i = 0; i < m; i++) {
            groupIndex.put(uf.find(groups.get(i).memb.get(0)), i);
        }
        for (int i = 0; i < r; i++) {
            String a = sc.next();
            String b = sc.next();
            int ga = groupIndex.get(uf.find(id.get(a)));
            int gb = groupIndex.get(uf.find(id.get(b)));
            if (ga != gb) {
                rival.get(ga).add(gb);
                rival.get(gb).add(ga);
            }
        }
        return rival;
    }

    private static boolean isValidSelection(int mask, ArrayList<ArrayList<Integer>> rival, ArrayList<Grp> groups, int limit) {
        int sumSkill = 0;
        for (int i = 0; i < groups.size(); i++) {
            if ((mask & (1 << i)) != 0) {
                for (int rivalGroup : rival.get(i)) {
                    if ((mask & (1 << rivalGroup)) != 0) {
                        return false;
                    }
                }
                sumSkill += groups.get(i).tSkill;
                if (sumSkill > limit) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int calculatePeopleCount(int mask, ArrayList<Grp> groups) {
        int count = 0;
        for (int i = 0; i < groups.size(); i++) {
            if ((mask & (1 << i)) != 0) {
                count += groups.get(i).size;
            }
        }
        return count;
    }

    private static int findOptimalSelection(ArrayList<Grp> groups, ArrayList<ArrayList<Integer>> rival, int limit) {
        int m = groups.size();
        int totalMasks = 1 << m;
        int best = 0;
        for (int mask = 0; mask < totalMasks; mask++) {
            if (isValidSelection(mask, rival, groups, limit)) {
                int count = calculatePeopleCount(mask, groups);
                best = Math.max(best, count);
            }
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        int[] skills = new int[n];
        for (int i = 0; i < n; i++) {
            skills[i] = sc.nextInt();
        }
        Map<String, Integer> id = bIdMap(names);
        int f = sc.nextInt();
        UnionFind uf = pF(n, f, sc, id);
        ArrayList<Grp> groups = formGrps(n, uf, skills);
        int r = sc.nextInt();
        ArrayList<ArrayList<Integer>> rival = bRG(r, sc, id, uf, groups);
        int limit = sc.nextInt();
        int result = findOptimalSelection(groups, rival, limit);
        System.out.println(result);
        sc.close();
    }
}
