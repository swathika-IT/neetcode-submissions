class Solution {
    public int orangesRotting(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, i, j, 2);
                }
            }
        }
        int ans = 2;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
                ans = Math.max(ans, grid[i][j]);
            }
        }
        return ans - 2;
    }
    private void dfs(int[][] grid, int r, int c, int time) {
        if (r < 0 || c < 0 ||
            r >= grid.length || c >= grid[0].length ||
            grid[r][c] == 0 ||
            (grid[r][c] > 1 && grid[r][c] < time)) {
            return;
        }
        grid[r][c] = time;
        dfs(grid, r + 1, c, time + 1);
        dfs(grid, r - 1, c, time + 1);
        dfs(grid, r, c + 1, time + 1);
        dfs(grid, r, c - 1, time + 1);
    }
}