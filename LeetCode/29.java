class Solution {
    public int divide(int dividend, int divisor) {
		int result=0;
        if(dividend>0 ) {
        	if(divisor>0) {
        		if(dividend<divisor)
        			return 0;
        		while(dividend>=divisor) {
        			dividend-=divisor;
        			if(result+1!=Integer.MIN_VALUE) 
        				result++;
        		}
        		return result;
        	}else {
        		if(-dividend>divisor)
        			return 0;
        		while(dividend>=-divisor) {
        			dividend+=divisor;
        			result--;
        		}
        		return result;
        	}
        }else {
        	if(divisor>0) {
        		if(dividend>-divisor)
        			return 0;
        		while(dividend<=-divisor) {
        			dividend+=divisor;
        			result--;
        		}
        		return result;
        	}else {
        		if(dividend>divisor)
        			return 0;
        		while(dividend<=divisor) {
        			dividend-=divisor;
        			if(result+1!=Integer.MIN_VALUE) 
        				result++;
        		}
        		return result;
        	}
        }
    }
}
