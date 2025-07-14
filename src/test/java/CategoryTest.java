import org.junit.jupiter.api.Test;
import org.minbeom.lib.category.*;


public class CategoryTest {
    @Test
    public void test() {
        CategoryGroup download = new CategoryGroup();
        CategoryGroup document = new CategoryGroup();
        CategoryGroup video = new CategoryGroup();
        CategoryAction mp4 = new CategoryAction(E_CATE.E_DOWNLOADER.E_VIDEO.MP4.getAction());

        video.Push(E_CATE.E_DOWNLOADER.E_VIDEO.MP4.name(), mp4);
        document.Push(E_CATE.E_DOWNLOADER.VIDEO.name(), video);
        download.Push(E_CATE.DOWNLOADER.name(), document);

        System.out.println(download.Get(E_CATE.DOWNLOADER.name()));
    }

    @Test
    public void test2() {
        CategoryAction action = Category.INSTANCE.GetCateCallback(E_CATE.DOWNLOADER.name());
        action.Invoke();

        System.out.println(Category.INSTANCE.getCateQueue());
    }
}
