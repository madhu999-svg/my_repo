public class String_mtds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StringBuffer sb=new StringBuffer();
    System.out.println(sb.capacity());
    sb.append("java programming");
    System.out.println(sb.capacity());
    sb.insert(4,"-");
    System.out.println(sb.toString());
    sb.replace(6,17,"learning");
    System.out.println(sb.toString());
    sb.reverse();
    System.out.println(sb.toString());
    sb.delete(6,13);
    System.out.println(sb.toString());
	}

}
