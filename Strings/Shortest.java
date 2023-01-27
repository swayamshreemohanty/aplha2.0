public class Shortest {

    private static double getShortestpath(String path) {
        double shortestPath = 0;
        int xAxis = 0;
        int yAxis = 0;
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'E':
                    xAxis++;
                    break;
                case 'W':
                    xAxis--;
                    break;
                case 'N':
                    yAxis++;
                    break;
                case 'S':
                    yAxis--;
                    break;
                default:
                    break;
            }
        }

        int X2 = xAxis * xAxis; // (x2-x1)^2, here x1 is 0 (Origin). x2 is the travelled path, i.e:xAxis
        int Y2 = yAxis * yAxis; // (y2-y1)^2, here y1 is 0 (Origin). y2 is the travelled path, i.e:xAxis

        shortestPath = Math.sqrt(X2 + Y2);
        return shortestPath;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestpath(path));
    }
}