import defaultMethod.PaymentTypeImp;

public class App {
    public static final PaymentTypeImp paymentTypeImp = new PaymentTypeImp();
    public static void main(String[] args) throws Exception {
        /*
        DuplicateList ds =new DuplicateList();
        ds.duplicateElementInList(Arrays.asList(2, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        */

//        System.out.println(StreamApiPracticeQuestion.evenNumber(Arrays.asList(2, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
//        System.out.println(StreamApiPracticeQuestion.squaringEvenNumber(Arrays.asList(2, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
//        System.out.println(StreamApiPracticeQuestion.longeststring(Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry")));
//        System.out.println(StreamApiPracticeQuestion.countLengthString(Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry")));
//        System.out.println(StreamApiPracticeQuestion.distinctNumber(Arrays.asList(2, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
//        System.out.println(StreamApiPracticeQuestion.countOccurrenceOfEachCharacter("VivekAdarsh"));
//        StreamApiPracticeQuestion.countOccurrenceOfEachCharacter("vivekadarsh").forEach((character,count)-> System.out.print("'"+ character +":"+count+","));

        paymentTypeImp.showPaymentType();
        paymentTypeImp.showCARDPaymentType();


    }
}
