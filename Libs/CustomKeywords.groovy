
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import com.kms.katalon.core.model.FailureHandling

import java.lang.String

import java.lang.Object



def static "com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword.setDate"(
    	TestObject to	
     , 	int day	
     , 	int month	
     , 	int year	
     , 	int slideTimeOut	
     , 	FailureHandling flowControl	) {
    (new com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword()).setDate(
        	to
         , 	day
         , 	month
         , 	year
         , 	slideTimeOut
         , 	flowControl)
}


def static "com.kms.katalon.keyword.pdf.PDF.getPageNumber"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getPageNumber(
        	file)
}


def static "com.kms.katalon.keyword.pdf.PDF.compareAllPages"(
    	String file1	
     , 	String file2	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareAllPages(
        	file1
         , 	file2
         , 	excludePattern)
}


def static "com.kms.katalon.keyword.pdf.PDF.getTextFromPage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getTextFromPage(
        	file
         , 	startPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.compareFromPage"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareFromPage(
        	file1
         , 	file2
         , 	startPage
         , 	excludePattern)
}


def static "com.kms.katalon.keyword.pdf.PDF.savePageAsImage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).savePageAsImage(
        	file
         , 	startPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.compareByPixel"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	int endPage	
     , 	boolean highlightImageDifferences	
     , 	boolean showAllDifferences	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareByPixel(
        	file1
         , 	file2
         , 	startPage
         , 	endPage
         , 	highlightImageDifferences
         , 	showAllDifferences)
}


def static "com.kms.katalon.keyword.pdf.PDF.getAllText"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getAllText(
        	file)
}


def static "com.kms.katalon.keyword.pdf.PDF.extractAllImages"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractAllImages(
        	file)
}


def static "com.kms.katalon.keyword.pdf.PDF.extractImagesInPageRange"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractImagesInPageRange(
        	file
         , 	startPage
         , 	endPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.savePageRangeAsImages"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).savePageRangeAsImages(
        	file
         , 	startPage
         , 	endPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.extractImagesFromPage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractImagesFromPage(
        	file
         , 	startPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.getTextInPageRange"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getTextInPageRange(
        	file
         , 	startPage
         , 	endPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.compareInPageRange"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	int endPage	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareInPageRange(
        	file1
         , 	file2
         , 	startPage
         , 	endPage
         , 	excludePattern)
}


def static "com.kms.katalon.keyword.pdf.PDF.saveAllPagesAsImages"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).saveAllPagesAsImages(
        	file)
}
