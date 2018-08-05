package com.dbPlug.sorm.utils;

/**
 * 封装了字符串常用的操作
 *
 */
public class StringUtils {
	
    /// aa_bb -> Aa_Bb
	public static String firstChar2UpperCase(String str){
		//abcd-->Abcd
		String[] strings =  str.split("_");
		String tableName = "";
        for (String item : strings){
        	tableName+=item.toUpperCase().substring(0, 1)+item.substring(1)+"_";
		}
		return  tableName.substring(0,tableName.length()-1);
	}

	
}
