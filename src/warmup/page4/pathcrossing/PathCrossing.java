package warmup.page4.pathcrossing;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author: Peixiao Zhao
 */
class Solution {

    class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }
        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public boolean isPathCrossing(String path) {
        Set<Point> visited = new HashSet<Point>(){{add(new Point(0,0));}};
        int x = 0, y = 0;
        for(int i = 0; i < path.length(); i++) {
            switch(path.charAt(i)){
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
            Point p = new Point(x,y);
            if(visited.contains(p)) {
                return true;
            }
            visited.add(p);
        }
        return false;
    }
}

