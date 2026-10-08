class Solution {
    public int distributeCandies(int[] candyType) {

        int different = 0;

        for (int i = 0; i < candyType.length; i++) {

            boolean already = false;

            for (int j = 0; j < i; j++) {

                if (candyType[i] == candyType[j]) {
                    already = true;
                    break;
                }
            }

            if (!already) {
                different++;
            }
        }

        return Math.min(different, candyType.length / 2);
    }
}