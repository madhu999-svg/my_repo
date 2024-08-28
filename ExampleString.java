public class ExampleString {

	public static void main(String[] args) {
		String str ="Java programming",str2="java programming";
		// TODO Auto-generated method stub
				System.out.println(str.length());
				System.out.println(str2.isEmpty());
				System.out.println(str2.isBlank());
				System.out.println(str.charAt(6));
				System.out.println(str.startsWith("Java"));
				System.out.println(str.endsWith("ing"));
				System.out.println(str.endsWith("kro"));
				System.out.println(str.substring(6));
				System.out.println(str.substring(3,9));
			    System.out.println(str.concat(str2));
			    System.out.println(str.replace("a", "y"));
			    System.out.println(str.contains("ava"));
			    System.out.println(str.replaceFirst("av","Nitro"));
			    System.out.println(str.replaceAll("[am]","Nitro"));
			    String[]arr="Hi iam learning java programming".split(" ");
			    for(int i=0;i<arr.length;i++)
			    {
			    	System.out.println(arr[i]);
			    }
			    String str4="Nitro".trim(),str5="hi".strip();
			    System.out.println(str4.concat(str5));
			    System.out.println(str.toString());
			    String str6=String.valueOf(38.23f);
			    System.out.println(str.equals(str2));
			    System.out.println(str.equalsIgnoreCase(str2));
			    System.out.println(str.compareTo(str2));
			    System.out.println(str.compareToIgnoreCase(str2));
			 

	}

}
