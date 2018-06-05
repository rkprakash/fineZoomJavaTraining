class Arguments{
	public static void main(String args[]){
		String a,b;
		System.out.println(args[0]);
		System.out.println(args[1]);
		a=args[0];
		b=args[1];
		//int c=a+b;
		int c = Integer.parseInt(a)+Integer.parseInt(b);;
		//String l=String.valueOf(c);
		System.out.println(c);
	}
}