package page4.floodfill;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor)
            return image;
        fill(image, sr, sc, image[sr][sc], newColor);

        image[sr][sc] = newColor;
        return image;
    }

    public void fill(int[][] images, int sr, int sc, int oldColor, int newColor) {
        //left
        for (int i = sc - 1; i >= 0; i--) {
            if (images[sr][i] != oldColor)
                break;
            images[sr][i] = newColor;
            fill(images, sr, i, oldColor, newColor);

        }

        //right
        for (int i = sc + 1; i < images[0].length; i++) {
            if (images[sr][i] != oldColor)
                break;
            images[sr][i] = newColor;
            fill(images, sr, i, oldColor, newColor);
        }

        //top
        for (int i = sr - 1; i >= 0; i--) {
            if (images[i][sc] != oldColor)
                break;
            images[i][sc] = newColor;
            fill(images, i, sc, oldColor, newColor);
        }

        //bottom
        for (int i = sr + 1; i < images.length; i++) {
            if (images[i][sc] != oldColor)
                break;
            images[i][sc] = newColor;
            fill(images, i, sc, oldColor, newColor);
        }

    }
}
