package javaBasic;

import java.io.File;

import commons.GlobalContants;

public class Topic_01_Upload {
	
	static String halongCity = "Ha Long.jpg";
	static String hoianCity  = "Hoi An.jpg";
	static String ninhbinhCity = "Ninh Binh.jpg";

	static String[] fileNames = {"Ha Long.jpg", "Hoi An.jpg", "Ninh Binh.jpg"};

	public static void main(String[] args) {
//		String filePath = System.getProperty("user.dir") + File.separator + "Image" + File.separator;
//		System.out.println(filePath);
		
		
   	String filePath = GlobalContants.FILE_IMAGE_PATH;
    	
   	
   	
    	String fullFileName = "";
    	for (String file : fileNames) {
			fullFileName = fullFileName + filePath + file + "\n";
		}
    	fullFileName.trim();
    	System.out.println(fullFileName);
		
		//C:\Users\t002404\Downloads\LearnAuto\hybird-framework-nopcommerce\Image
		//C:\Users\t002404\Downloads\LearnAuto\hybird-framework-nopcommerce\Image

		//C:\Users\t002404\Downloads\LearnAuto\hybird-framework-nopcommerce\Image\Ha Long.jpg
		//C:\Users\t002404\Downloads\LearnAuto\hybird-framework-nopcommerce\Image\Ha Long.jpg
	}

}
