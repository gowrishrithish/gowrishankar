import java.util.HashMap;
public class Isomorphic {
	
	public boolean Check(String str1 , String str2){
	if(str1 == null || str2 == null){
	return false;
	}
	if( str1.length() != str2.length()){
	return false;
	}
	if( ! (charAtPosition(str1).toString().equals(charAtPosition(str2).toString())) ) {
	return false;
	}

	return true;
	}

	public StringBuilder charAtPosition(String str) {
	HashMap hm = new HashMap();
	StringBuilder charPos = new StringBuilder();
	for(int i =0 ; i < str.length() ; i++) {
	if( hm.containsKey(String.valueOf(str.charAt(i)))) {
	charPos.append(hm.get(String.valueOf(str.charAt(i))));

	} else {
	hm.put(String.valueOf(str.charAt(i)), i);
	charPos.append(i);
	}
	}
	System.out.println(str + " " + charPos);

	return charPos;
	}

	public static void main(String args[])
	{
	System.out.println(System.currentTimeMillis());
	Isomorphic ism = new Isomorphic();

	System.out.println(ism.Check("abba", "noon"));
	System.out.println(System.currentTimeMillis());
	}

	}

