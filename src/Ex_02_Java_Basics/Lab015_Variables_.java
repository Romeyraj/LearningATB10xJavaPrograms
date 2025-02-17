package Ex_02_Java_Basics;

public class Lab015_Variables_ {
    public static void main(String[] args) {
        int a = 10;
        /**
         * In the above example int= data type (It can be int, short,byte,long,float....
         * a is Variable name which is known as Identifier
         * 10 is Variable value which is known as Literal
         * Data Type (int) variable_name(a) = 10 (Literal)
         */
        int age =65;
        age =89;
        System.out.println(age);

        int age_1 = 76;
        age_1 = age_1+1;
        age_1= 76;
        System.out.println(age_1);
        // Here we made a Identifier age_1 =76 then we added +1  but we again defined age_1 to 76 so the final output is 76 it will pick the latest version
        //int is the primitive data type which is numeric
        //It store the whole number without any decimal point
        //= in the Variable is an Assignment Operator


    }
}
