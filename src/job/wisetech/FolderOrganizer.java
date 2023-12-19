package job.wisetech;

public class FolderOrganizer {

    public static int minFolders(int cssFiles, int jsFiles, int readMeFiles, int capacity) {
        // Write your code here

        int count = 0;
        if (capacity == 1) return cssFiles + jsFiles + readMeFiles;
        int tempCap = capacity;

        while(cssFiles > 0 || jsFiles > 0 || readMeFiles > 0) {
            int increament = 1;
            if (readMeFiles > 0) {
                readMeFiles--;
                tempCap--;
            }
            if (jsFiles > 0 && cssFiles == 0) {
                jsFiles -= increament;
            } else if (cssFiles > 0 && jsFiles == 0) {
                cssFiles -=increament;
            } else {
                int min = Math.min(Math.min(tempCap / 2, cssFiles),jsFiles);
                jsFiles -= min;
                cssFiles -= min;
                int leftCap = tempCap - min - min;
                if(jsFiles > 0 && cssFiles==0){
                    jsFiles -= leftCap;
                } else if(cssFiles > 0 && jsFiles ==0){
                    cssFiles -= leftCap;
                } else {
                    if (jsFiles > cssFiles) {
                        jsFiles -= leftCap;
                    } else {
                        cssFiles -= leftCap;
                    }
                }
            }
            tempCap = capacity;
            count++;
        }
        return count;

    }

    public static void main(String arg[]) {
        //System.out.println(minFolders(5,0,2,2));
        //64236,49164,38865,2
        //System.out.println(minFolders(1862,52,239,60));
        //2364,76956,35794,2
        //System.out.println(minFolders(64236,49164,38865,2));
        //System.out.println(minFolders(2364,76956,35794,2));
        System.out.println(minFolders(0,13,7,5));
    }
}
