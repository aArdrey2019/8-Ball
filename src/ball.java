import java.util.Scanner;

public class ball {

    public static void main(String [] args) {
     //int
        Scanner input;
        input = new Scanner(System.in);
        int luckyNumber;
        //Good
        String good1;
        String good2;
        String good3;
        String good4;
        String good5;
        //Bad
        String bad1;
        String bad2;
        String bad3;
        String bad4;
        String bad5;
        String picked8;
     //string values
        picked8 = "Aww you're sweet";
        //good
        good1 = "In foreseeable future";
        good2 = "Soon";
        good3 = "Out looks good";
        good4 = "Great odds";
        good5 = "For certain";
        //bad
        bad1 = "Does not look good";
        bad2 = "Out look not great";
        bad3 = "Not happening";
        bad4 = "Terrible odds";
        bad5 = "Give Up";
     //main code
        System.out.println("Ask Me Anything, I Am The All Knowing 8 Ball.");
        input.nextLine();
        System.out.println("Now What Is your Lucky  1-100");
        luckyNumber = input.nextInt();
     //All The Ifs
        if (luckyNumber==8){
        System.out.println(picked8);}
        else if (luckyNumber<10){
        System.out.println(good1);}
        else if (luckyNumber<20){
        System.out.println(good2);}
        else if (luckyNumber<30){
        System.out.println(good3);}
        else if (luckyNumber<40){
        System.out.println(good4);}
        else if (luckyNumber<50){
        System.out.println(good5);}
        else if (luckyNumber<60){
        System.out.println(bad1);}
        else if (luckyNumber<70){
        System.out.println(bad2);}
        else if (luckyNumber<80){
        System.out.println(bad3);}
        else if (luckyNumber<90){
        System.out.println(bad4);}
        else if (luckyNumber<100){
        System.out.println(bad5);}
        }
    }
