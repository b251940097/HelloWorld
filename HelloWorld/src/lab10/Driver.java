package lab10;

public class Driver extends Vehicle {
 
    private String жолоочийнКод;
    private String үнэмлэхийнАнги;   
    private String бүртгэлийнДугаар; 
    private String худалдаанАвсанОгноо; 
 

    public Driver(String марк, String загвар, int үйлдвэрлэсэнОн, String өнгө, double хөдөлгүүрийнБагтаамж, String жолоочийнКод, String үнэмлэхийнАнги, String бүртгэлийнДугаар, String худалдаанАвсанОгноо) {
        super(марк, загвар, үйлдвэрлэсэнОн, өнгө, хөдөлгүүрийнБагтаамж);
        this.жолоочийнКод = жолоочийнКод;
        this.үнэмлэхийнАнги = үнэмлэхийнАнги;
        this.бүртгэлийнДугаар = бүртгэлийнДугаар;
        this.худалдаанАвсанОгноо = худалдаанАвсанОгноо;
    }
 


    public void info() {
        super.info(); 
        System.out.println("Жолоочийн мэдээлэл");
        System.out.println("Жолоочийн код    : " + жолоочийнКод);
        System.out.println("Үнэмлэхийн анги  : " + үнэмлэхийнАнги + " анги");
        System.out.println("Улсын дугаар     : " + бүртгэлийнДугаар);
        System.out.println("Авсан он         : " + getYear(худалдаанАвсанОгноо));
        System.out.println("Авсан сар        : " + getMonth(худалдаанАвсанОгноо));
        System.out.println("Авсан өдөр       : " + getDay(худалдаанАвсанОгноо));
        System.out.println("");
    }
}
 

