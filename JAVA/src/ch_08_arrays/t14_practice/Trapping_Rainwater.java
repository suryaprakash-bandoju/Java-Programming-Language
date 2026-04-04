package ch_08_arrays.t14_practice;

public class Trapping_Rainwater {

    public static int trappingRainWater(int heights[]) {
        int n = heights.length;
        //Left Boundary
        int LeftMax[] = new int[n];
        LeftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            LeftMax[i] = Math.max(LeftMax[i - 1], heights[i]);
        }
        
        // Right Max Boundary
        int RightMax[] = new int[n];
        RightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(RightMax[i + 1], heights[i]);
        }

        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(LeftMax[i], RightMax[i]);
            trappedwater += waterLevel - heights[i];
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int heights[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trappingRainWater(heights));
    }
}
