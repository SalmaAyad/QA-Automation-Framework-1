import org.openqa.selenium.By;
<<<<<<< Updated upstream
import org.openqa.selenium.JavascriptExecutor;
=======
>>>>>>> Stashed changes
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest {
    @Test
<<<<<<< Updated upstream
    public void addSongToPlaylist() throws InterruptedException {
=======
        public void addSongToPlaylist() throws InterruptedException {
>>>>>>> Stashed changes
        provideEmail("salma.ayad.87@gmail.com");
        providePassword();
        clickSubmitBtn();
        clickAllSongs();
        chooseSongClickAddTo();
<<<<<<< Updated upstream

        //Choose Playlist to add the song to
        WebElement playlistDropdownSelector = driver.findElement(By.xpath("//*[@id='songsWrapper']/header/div[3]/div/section[1]/ul/li[5]"));
        playlistDropdownSelector.click();
        Thread.sleep(2000);

        //Clicking on the playlist
        WebElement playlistSelector = driver.findElement(By.xpath("//*[@id='playlists']/ul/li[3]/a"));
=======
        Thread.sleep(2000);

        //Choose Playlist to add the song to

       // WebElement playlistDropdownSelector = driver.findElement(By.xpath("//*[@id='songsWrapper']/header/div[3]/div/section[1]/ul/li[5]"));
        WebElement playlistDropdownSelector = driver.findElement(By.xpath("//section[@id='songsWrapper']//ul//li[contains(text() , 'Salma New Playlist')]"));
        //section[@id='songsWrapper']//li[contains(text(),"Salma's New Playlist")]
        playlistDropdownSelector.click();

       // WebElement myPlaylistSelector =
        Thread.sleep(2000);

        //Clicking on the playlist
        WebElement playlistSelector = driver.findElement(By.xpath("//a[text()='Salma New Playlist']"));
>>>>>>> Stashed changes
        playlistSelector.click();

        //Verifying the song is added to the playlist
        WebElement confirmSongIsAdded = driver.findElement(By.xpath("//div[@class='song-list-wrap main-scroll-wrap playlist']"));
        Assert.assertTrue(confirmSongIsAdded.getText().contains("Mid-Air Machine"));

    }

    private void chooseSongClickAddTo() {
        WebElement SongSelector = driver.findElement(By.xpath("//td[text()='Mid-Air Machine - If It_s All I Do']"));
        SongSelector.click();
        WebElement addToBtn = driver.findElement(By.cssSelector("button.btn-add-to"));
        addToBtn.click();
    }


<<<<<<< Updated upstream
    private void clickAllSongs() {
        WebElement clickAllSongsBtn = driver.findElement(By.xpath("//a[@class='songs']"));
        clickAllSongsBtn.click();

    }
=======

>>>>>>> Stashed changes

    @Test
    public void addSongToFavorites() throws InterruptedException {
        provideEmail("salma.ayad.87@gmail.com");
        providePassword();
        clickSubmitBtn();
        clickAllSongs();
        chooseSongClickAddTo();
        //Add songs to favorites
        WebElement FavoritesDropdownSelector = driver.findElement(By.xpath("//li[@class='favorites']"));
        FavoritesDropdownSelector.click();
        //Clicking on favorites
        WebElement favoritesSelector = driver.findElement(By.cssSelector("li.playlist.favorites"));
        favoritesSelector.click();
        //Confirm Song is added
        WebElement confirmSongIsAdded = driver.findElement(By.cssSelector("#favoritesWrapper > div"));
        Assert.assertTrue(confirmSongIsAdded.getText().contains("Mid-Air Machine"));
    }
}

