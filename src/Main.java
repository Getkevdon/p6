void main() {
    System.out.println(power(3,4));
    reverseNumbers(16)
}

public int power(int b, int e) {


    if (e == 1) {

        return b;
    }
    else {
        return b * power(b, e-1);
    }
}

public static int reverseNumbers(int input) {
    if (input < 10)
    {
        System.out.println(input);
        return 0;
    }else {
        int num = input % reverseNumbers(input);
    }
    System.out.println(input);
    return 0;
}
