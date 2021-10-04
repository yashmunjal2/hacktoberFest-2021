public class Substitute
    {
    public int getValue(String key, String code)
        {
        	int res=0;
        	for( int i =0; i<code.length(); i++)
                {
                	if(key.indexOf(code.charAt(i))==key.length()-1)
                        {
                        	res=10*res+0;
                        }
                	else if(key.indexOf(code.charAt(i))>=0)
                        {
                        	res=10*res+(1+key.indexOf(code.charAt(i)));
                        }
                }
        	return res;
        }
    }
