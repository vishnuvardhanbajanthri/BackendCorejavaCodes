package com.cg.samplefornaresh;

import java.util.regex.Pattern;

class Email{
	Header header;
	String body;
	String greetings;

	public Email(Header header, String body, String greetings) {
		super();
		this.header = header;
		this.body = body;
		this.greetings = greetings;
	}
}
class Header{
	String from;
	String to;
	public Header(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}

}
class EmailOperations{
public static int emailVerify(Email e) {
		String string = "^([a-zA-Z_]{1}[a-zA-Z]+)@([a-zA-Z]+)\\.([a-zA-Z]{2,30})$";
		int value;
		boolean m1, m2;
		m1 = Pattern.matches(string, e.header.from);
		m2 = Pattern.matches(string, e.header.to);
		if (m1 && m2 == true)
			value=2;
		else if (m1 || m2 == true)
			value=1;
		else
			value=0;
		//System.out.println(value);
         return value;
	}
	  public static String bodyEncryption(Email e) {
		  StringBuffer result= new StringBuffer();
		  
	        for (int i=0; i<e.body.length(); i++)
	        {
	            if (Character.isUpperCase(e.body.charAt(i)))
	            {
	                char ch = (char)(((int)e.body.charAt(i) +
	                                  3 - 65) % 26 + 65);
	                result.append(ch);
	            }
	            else if(Character.isSpace(e.body.charAt(i))) {
	            	result.append(e.body.charAt(i));
	            }
	            else
	            {
	                char ch = (char)(((int)e.body.charAt(i) +
	                                  3 - 97) % 26 + 97);
	                result.append(ch);
	            }
	        }
	        //System.out.println(result.toString());
	        return result.toString();
	  }
	 public static String greetingMessage(Email e) {
		 String string1=e.greetings;
		 String string2=e.header.from;
			int i= string2.indexOf("@");
		 StringBuffer sb=new StringBuffer();
				 sb.append(string2);
		 StringBuffer sb2=sb.delete(i, sb.length());
		 String concat=string1.concat(" ").concat(sb2.toString());
		// System.out.println(concat);
		 return concat;
	  }
	
}
public class Source {
	public static void main(String args[] ) throws Exception {
		String from = "Jesirupa@gmail.com";
		String to = "jesintha@gmail.com";
		Header e = new Header(from, to);
		String body = "Hi How Are You";
		String greetings = "Regards";
		Email email = new Email(e, body, greetings);
		EmailOperations.emailVerify(email);
		EmailOperations.bodyEncryption(email);
		EmailOperations.greetingMessage(email);
	}
}
