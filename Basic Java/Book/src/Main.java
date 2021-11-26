
public class Main {



	public static void main(String[] args) {
		Book bk=new Book("Book1",500,"ISBN 563-26-7868");
		System.out.println(bk.toString());
		Book ck=new Book("Book2",600,"ISBN 3423-75-434");
		System.out.println(ck);    //here java internally does ck.toString()
        Book rk=new Book();
        rk.setName("Book3");
        rk.setIsbn("ISBN 4534-4-2121");
        rk.setPrice(450);
        System.out.println(rk);
        System.out.println(rk.getIsbn());
	}

}
