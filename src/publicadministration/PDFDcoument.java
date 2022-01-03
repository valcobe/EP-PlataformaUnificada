package publicadministration;

import data.DocPath;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class PDFDcoument { //Represents a PDF document

    private Date creatDate;
    private DocPath path;
    private File file;

    public PDFDcoument(Date date, DocPath dpath, File f){ //Initializes attributes and emulates the document download at a default path
        this.creatDate = date;
        this.path = dpath;
        this.file = f;
    }

    public Date getCreatDate(){
        return creatDate;
    }

    public DocPath getPath(){
        return path;
    }

    public File getFile(){
        return file;
    }

    public String toString(){

    } //Converts to String members Date and DocPath

    //To implement only optionally

    public void moveDoc (DocPath destPath) throws IOException{

    } //Moves the document to the destination path indicated

    public void openDoc (DocPath path) throws IOException{

    } //Opens the document at the path indicated
}
