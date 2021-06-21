class HW38
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int [][] nums = new int[5][8]; // setting a two-dimensional array
	for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 200 - 100); // setting values on random method
            }
	}
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                System.out.printf("%d ", nums[i][j]); // outputting an array
            }
            System.out.println(); // transition to the next line
        }
         int max = nums[0][0]; // setting a maximum value
        for (int i = 1; i < nums.length; i++){
            for(int j=0; j<nums[i].length; j++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];
                }
            }
        }
        System.out.println("Maximum element:" + max); // outputting the maximum element of an array
	}
}