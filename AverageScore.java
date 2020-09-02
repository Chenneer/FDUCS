public class AverageScore{
    public static void main(String[] args){
        int a[] ={61,57,95,85,75,65,44,66,90,32};
        int sum = 0;
        for(int i=0;i<10;i++){
            sum=sum+a[i];
        }
        int average = sum/10;
        System.out.println("平均成绩为"+average);

    }
}