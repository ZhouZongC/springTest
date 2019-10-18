package test;

public class Cmower {

    //选择排序法
    public static void selectSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j =i;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    exchange(arr,i,j);
                }
            }
        }

    }
    //冒泡排序法
    public static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    exchange(arr,j,j+1);
                }
            }
        }
    }
    //交换数组中两个元素的地址
    public static void exchange(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    //打印一个数组
    public static void printArr(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(i==arr.length-1) {
                System.out.println(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 4, 9, 8, 6, 7, 10, 3, 3 };
        printArr(arr);
        selectSort(arr);
//        bubbleSort(arr);
        printArr(arr);
    }

    /**
     *
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }


    }
