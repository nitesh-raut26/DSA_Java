package Strings;

// given a route containing 4 directions (E,W,N,S)
// find the shortest path to reach destination.


public class shortestPath {
    public static int shortPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x += 1;
            } else if (str.charAt(i) == 'W') {
                x -= 1;
            } else if (str.charAt(i) == 'N') {
                y += 1;
            } else {
                y -= 1;
            }
        }
        int ans = (x*x + y*y);
        return (int)Math.sqrt(ans);
    }
    public static void main(String[] args) {
        String str = "NS";
        System.out.println(shortPath(str));

    }
}
