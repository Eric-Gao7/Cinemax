
public interface FilmDAO {
	public void addFilm(String title);
	public void deleteFilm(String title);
	public void addComment(String msg);
	public void putComment(String msg);
	public void addPictures(String pic);
	public void deletePictures(String ic);
	public void addTrailers(String Tra);
	public void deleteTrailers(String Tra);
	public int addNote(int n);

}
