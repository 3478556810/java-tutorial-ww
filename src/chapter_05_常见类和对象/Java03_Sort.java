package chapter_05_常见类和对象;

/**
 * @projectName: java-tutorial
 * @package: chapter_05_常见类和对象
 * @className: Java03_Sort
 * @author: tsukishiro
 * @description: TODO 排序
 * @date: 2023/3/20 21:31
 * @version: 1.0
 */
public class Java03_Sort {

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 2, 3};

//        //冒泡排序
//        for (int j=0; j<nums.length;j++)//每次循环，待排序列元素数目减1
//        for(int i=0;i<nums.length-j-1;i++)//循环比较相邻的两个元素，故i的取值为【0--(nums.length-2)】
//        {
//            int num1 =nums[i];
//            int num2 =nums[i+1];
//            if(num1 > num2) //左边的数据大于右边的数据，应该进行数据交换
//            {
//                nums[i]=num2;
//                nums[i+1]=num1;
//            }
//        }

//        //选择排序 减少交换次数 每次循环确定最大元素所在坐标 将末尾元素与其最大元素进行交换
//        for (int j = 0; j < nums.length; j++) {
//
//            int MaxIndex = 0;
//            for (int i = 1; i < nums.length - j; i++) {
//                if (nums[i] > nums[MaxIndex]) {
//                    MaxIndex = i;
//                }
//            }
//
//            int num1 = nums[nums.length - j - 1];
//            int num2 = nums[MaxIndex];
//
//            nums[MaxIndex] = num1;
//            nums[nums.length - j - 1] = num2;
//
//        }

        //二分查找
        int []numSorted={1,2,3,4,5,6};

        int target=5;
        int start =0;
        int end =numSorted.length-1;
        int middle =0;
        while (start<=end)
        {
            middle=(start+end)/2;
            if(numSorted[middle]>target)
            end=middle-1;
            else if(numSorted[middle]<target)
            start=middle+1;
            else break;

        }
        System.out.println("数据在数组的"+middle+"号位置");


        //输出数组
        for (int num :
                nums) {
            System.out.println(num);

        }
    }

}
