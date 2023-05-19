package classesAndObjs_Exp;

public class MainBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser objChr=new Chrome();
		objChr.openBrowser();
		objChr.closeBrowser();
		Browser objFF=new FireFox();
		objFF.openBrowser();
		objFF.closeBrowser();

	}

}
