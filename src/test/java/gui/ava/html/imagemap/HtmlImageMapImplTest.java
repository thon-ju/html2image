package gui.ava.html.imagemap;

import gui.ava.html.BaseTest;
import gui.ava.html.Html2Image;
import org.junit.Test;

import java.net.URL;

/**
 * @author Yoav Aharoni
 */
public class HtmlImageMapImplTest extends BaseTest {
//	@Test
//	public void test1ImageMapDocument() throws Exception {
//		final Html2Image html2Image = Html2Image.fromURL(getTest1Url());
//		html2Image.getImageRenderer().saveImage("test1.png");
//		html2Image.getHtmlImageMap().saveImageMapDocument("test1.html", "test1.png");
//	}
//
    @Test
    public void bicogoImageMapDocument() throws Exception {
        final Html2Image html2Image = Html2Image.fromURL(new URL("http://lanbaoo.com/login"));
        html2Image.getImageRenderer().saveImage("lanbaoo.png");
        //html2Image.getHtmlImageMap().saveImageMapDocument("bicogo.html", "bicogo.png");
    }


//	@Test
//	public void googleImageMapDocument() throws Exception {
//		final Html2Image html2Image = Html2Image.fromURL(new URL("http://www.lanbaoo.com/open/baby"));
//		html2Image.getImageRenderer().saveImage("lanbaoo.png");
//		html2Image.getHtmlImageMap().saveImageMapDocument("lanbaoo.html", "lanbaoo.png");
//	}

	@Test
	public void hebImageMapDocument() throws Exception {
		final Html2Image html2Image = Html2Image.fromHtml("<div class=\"blog-post\">\n" +
                "        <h2 class=\"blog-post-title\"><a href=\"/d?p=1\">一个新的开始</a></h2>\n" +
                "        <p class=\"blog-post-meta\">\n" +
                "            <a href=\"#\">thon</a>\n" +
                "            <span> 发布于 </span><span class=\"glyphicon glyphicon-time\"></span>\n" +
                "            <span class=\"timeago\" title=\"2014-08-31 23:16:13\">1天 前</span>\n" +
                "            <span class=\"glyphicon glyphicon-comment\"></span><a class=\"btn-link\" href=\"#comment-form\">评论（0）</a>\n" +
                "        </p>\n" +
                "\n" +
                "        \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<p>今天是2014年8月31日，离开学校已经有了很长一段日子，具体来说四年已经过去。</p>\n" +
                "<p>想起三年前的今日还在深圳，也许刚刚从中兴通讯32楼下来，兴许刚坐上19路在回西丽的路上。</p>\n" +
                "<p>时间匆匆，回来成都已经快要三年。</p>\n" +
                "<p>这些年，曾不知疲倦，激情满满；</p>\n" +
                "<p>这些年，孤独，寂寞，彷徨；</p>\n" +
                "<p>这些年，在痛苦中成长，在傍徨中前行；</p>\n" +
                "<p>总感觉自己老了，但是只要出发就不会失败，</p>\n" +
                "<p>是时候来次出发，一个新的开始，Let's go……</p>\n" +
                "\n" +
                "</div>");
		html2Image.getImageRenderer().saveImage("bicogo.png");
		//html2Image.getHtmlImageMap().saveImageMapDocument("heb.html", "heb.png");
	}

	@Test
	public void imageImageMapDocument() throws Exception {
		final Html2Image html2Image = Html2Image.fromHtml("<div>HELLO!<a href='javascript: alert(1);'><img src='http://www.lanbaoo.com/commons/attachment/download/193453/210x210'/></a></div>");
		html2Image.getImageRenderer().saveImage("html.png");
		//html2Image.getHtmlImageMap().saveImageMapDocument("image.html", "image.png");
	}
}
