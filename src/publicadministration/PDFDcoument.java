package publicadministration;

import data.DocPath;
import data.Exceptions.EmptyCodeException;
import data.Exceptions.NullObjectException;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class PDFDcoument { //Represents a PDF document

    private Date creatDate;
    private DocPath path;
    private File file;

    public PDFDcoument(Date createDate, DocPath path, File file){
        this.creatDate = new Date();
        this.path = path;
        this.file = file;
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
        return  getCreatDate() + "" + getFile() + "" + getPath();

    } //Converts to String members Date and DocPath

    //To implement only optionally

    public void moveDoc (DocPath destPath) throws IOException{

    } //Moves the document to the destination path indicated

    public void openDoc (DocPath path) throws IOException{

    } //Opens the document at the path indicated
}
