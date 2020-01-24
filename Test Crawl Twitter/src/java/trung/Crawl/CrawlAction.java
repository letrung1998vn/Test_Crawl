/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trung.Crawl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author letru
 */
public class CrawlAction {

    public CrawlAction() {
    }

    public String execute() throws Exception {
        try {
            Twitter twitter = TwitterFactory.getSingleton();
            Query query = new Query("mai hương");
            QueryResult result = twitter.search(query);
            List<TestStatus> statusList = new ArrayList<TestStatus>();
            for (Status status : result.getTweets()) {
//                System.out.println("@" + status.getId() + ":" + status.getText());
                statusList.add(new TestStatus("id:" + status.getId(), "Text:" + status.getText()));
            }
        } catch (TwitterException ex) {
            Logger.getLogger(CrawlServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "success";
    }

}
