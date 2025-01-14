package MethodOverRiding;

class Sbi {
    double Stockprice;

    Sbi(double Stockprice) {
        this.Stockprice = Stockprice;
    }

    public double returns() {
        return Stockprice * 0.02;
    }
}

class Tcs extends Sbi {
    Tcs(double Stockprice) {
        super(Stockprice);
    }

    public double returns() {
        return Stockprice * 0.08;
    }
}

class Itc extends Tcs {
    Itc(double Stockprice) {
        super(Stockprice);
    }

    public double returns() {
        return Stockprice * 0.1;
    }
}

public class StockMarket {
    public static void main(String[] args) {
        Sbi sbi = new Sbi(1000);
        Tcs tcs = new Tcs(1000);
        Itc itc = new Itc(1000);

        System.out.println("The Total Returns of SBI is :" + sbi.returns());
        System.out.println("The Total Returns of TCS is :" + tcs.returns());
        System.out.println("The Total Returns of ITC is :" + itc.returns());
    }
}
