package kr.co.blli.model.posting;

<<<<<<< HEAD
import java.io.IOException;
import java.net.URL;

import javax.annotation.Resource;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class PostingServiceImpl implements PostingService {
	@Resource
	private PostingDAO postingDAO;
	@Override
	public String jsoupTest() throws IOException {
		String key = "6694c8294c8d04cdfe78262583a13052"; //네이버 검색API 이용하기 위해 발급받은 key값
		String query = "샴푸의자"; //검색어(소제품)
		String postingURL; //포스팅주소
		String frameSourceURL; //프레임소스주소
		String postingTitle; //포스팅 제목
		String postingDescription; //포스팅 본문 요약
		String postingContent; //포스팅 본문
		int countOfImage; //포스팅에 등록된 이미지 갯수
		String linkOfMainImage; //대표 사진 링크
		//display : 검색 결과 갯수, start : 페이지 번호, target : 검색 대상, sort : 나열 기준(sim : 유사한 순대로 정렬)
		//Document doc = Jsoup.connect("http://openapi.naver.com/search?key=" + key + "&query=" + query + "&display=1&start=22&target=blog&sort=sim").get();
		String url = "http://openapi.naver.com/search?key=" + key + "&query=" + query + "&display=1&start=22&target=blog&sort=sim";
		Document doc = Jsoup.parse(new URL(url).openStream(),"UTF-8",url);
		//System.out.println(doc);
		Elements postingURLByOpenAPI = doc.select("item link"); //openAPI를 통해 얻은 포스팅URL
		int i = 1;
		for(Element e : postingURLByOpenAPI){
			doc = Jsoup.connect(e.html()).get();
			//System.out.println(doc);
			frameSourceURL = "http://blog.naver.com" + doc.select("#mainFrame").attr("src");
			//System.out.println(frameSourceURL);
			doc = Jsoup.connect(frameSourceURL).get();
			//System.out.println(doc);
			Elements metaInfo = doc.select("meta");
			for(Element el : metaInfo){
				String property = el.attr("property"); //meta정보
				if(property.contains("url")){
					postingURL = el.attr("content");
					//System.out.println(postingURL);
				}else if(property.contains("title")){
					postingTitle = el.attr("content");
					//System.out.println(postingTitle);
				}else if(property.contains("image")){
					linkOfMainImage = el.attr("content");
					//System.out.println(linkOfMainImage);
				}else if(property.contains("description")){
					postingDescription = el.attr("content");
					//System.out.println(postingDescription); //문제 생김
				}
			}
			//System.out.println(doc);
			//System.out.println(doc.select("#postViewArea"));
			//System.out.println(doc.select("#postViewArea img").size());
			//System.out.println(doc.select("#postViewArea span").html());
			//String content = doc.select("#postViewArea").text().replaceAll("\\p{Z}"," ").replaceAll("( )+", " ").trim();
			//System.out.println((i++) + " " + content.replace(doc.select("#postViewArea strong").text(), doc.select("#postViewArea strong").html()));
			//System.out.println((i++) + " " + doc.select("#postViewArea").text().replaceAll("\\p{Z}"," ").replaceAll("( )+", " ").trim());
			String test = doc.select("#postViewArea").text().replaceAll("\\p{Z}"," ").replaceAll("( )+", " ").trim();
			postingDAO.test(test);
		}
		return postingDAO.test2();
	}
=======
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class PostingServiceImpl implements PostingService{
	@Resource
	private PostingDAO postingDAO;
	
>>>>>>> branch 'master' of https://github.com/junyoungShon/projectBlli.git
}
