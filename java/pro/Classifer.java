
package pro;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author DLK
 */
public class Classifer 
{
   
    public Map data(String tran)
    {
         Map <String, String> mm = new LinkedHashMap();
        String status="";
        String occ="";
        if(tran.contains("political")||tran.contains("politics")||tran.contains("civil")||tran.contains("public")||tran.contains("governmental")||tran.contains("government")||tran.contains("national")||tran.contains("state")||tran.contains("persuasion")||tran.contains("official")||tran.contains("partisan")||tran.contains("embassy")||tran.contains("opinion")||tran.contains("civilian")||tran.contains("municipal")||tran.contains("domestic")||tran.contains("local")||tran.contains("civic")||tran.contains("politic")||tran.contains("politician")||tran.contains("profession")||tran.contains("internal")||tran.contains("constitutional")||tran.contains("economical")||tran.contains("federal")||tran.contains("adminstrative")||tran.contains("factious")||tran.contains("factional")||tran.contains("adroit")||tran.contains("artful")||tran.contains("circumspect")||tran.contains("diplomatic")||tran.contains("discreet")||tran.contains("politically")||tran.contains("politico")||tran.contains("judicious")||tran.contains("policy")||tran.contains("campaign")||tran.contains("policy-making")||tran.contains("parliamentary")||tran.contains("absolute")||tran.contains("statesmanlike")||tran.contains("aristocratic")||tran.contains("pluralistic")||tran.contains("patriarchal")||tran.contains("fascist")||tran.contains("despotic")||tran.contains("monarchal")||tran.contains("monarchic")||tran.contains("autocratic")||tran.contains("previous")||tran.contains("autonomous")||tran.contains("democratic")||tran.contains("federalist")||tran.contains("monarchial")||tran.contains("monocratic")||tran.contains("oligarchal")||tran.contains("republican")||tran.contains("suffragist")||tran.contains("theocratic")||tran.contains("dictatorial")||tran.contains("matriarchal")||tran.contains("matriarchic")||tran.contains("monarchical")||tran.contains("patriarchic")||tran.contains("federalistic")||tran.contains("geopolitical")||tran.contains("heteronomous")||tran.contains("totalitarian")||tran.contains("authoritarian")||tran.contains("gubernatorial")||tran.contains("politico-moral")||tran.contains("self-governing")||tran.contains("politico-social")||tran.contains("parliamentarian")||tran.contains("politico-economic")||tran.contains("politico-judicial")||tran.contains("politico-military")||tran.contains("politico")||tran.contains("judicial")||tran.contains("social")||tran.contains("economic")||tran.contains("military")||tran.contains("politico-religious")||tran.contains("religious")||tran.contains("politico-commercial")||tran.contains("politico-diplomatic")||tran.contains("politico-scientific")||tran.contains("politico-theological")||tran.contains("theological")||tran.contains("politico-geographical")||tran.contains("geographical")||tran.contains("countrywide")||tran.contains("nationwide")||tran.contains("bureaucratic")||tran.contains("legislative")||tran.contains("prudent")||tran.contains("chary")||tran.contains("expediant")||tran.contains("election")||tran.contains("direction")||tran.contains("economics")||tran.contains("economy")||tran.contains("housekeeping")||tran.contains("housewifery")||tran.contains("husbandry")||tran.contains("management")||tran.contains("news")||tran.contains("media")||tran.contains("police")||tran.contains("strike")||tran.contains("people")||tran.contains("trump")||tran.contains("bjp")||tran.contains("fbi")||tran.contains("hurricane")||tran.contains("rainfall")||tran.contains("breaking"))
        {
        if(tran.contains("political")==true)
        {
        occ="political";
        }
        if(tran.contains("politics")==true)
        {
        occ="politics";
        }
        if(tran.contains("civil")==true)
        {
        occ="civil";
        }
        if(tran.contains("public")==true)
        {
        occ="public";
        }
        if(tran.contains("governmental")==true)
        {
        occ="governmental";
        }
        if(tran.contains("government")==true)
        {
        occ="government";
        }
        if(tran.contains("national")==true)
        {
        occ="national";
        }
        if(tran.contains("state")==true)
        {
        occ="state";
        }
        if(tran.contains("persuasion")==true)
        {
        occ="persuasion";
        }
        if(tran.contains("official")==true)
        {
        occ="official";
        }
        if(tran.contains("partisan")==true)
        {
        occ="partisan";
        }
        if(tran.contains("embassy")==true)
        {
        occ="embassy";
        }
        if(tran.contains("opinion")==true)
        {
        occ="opinion";
        }
        if(tran.contains("civilian")==true)
        {
        occ="civilian";
        }
        if(tran.contains("municipal")==true)
        {
        occ="municipal";
        }
        if(tran.contains("domestic")==true)
        {
        occ="domestic";
        }
        if(tran.contains("local")==true)
        {
        occ="local";
        }
        if(tran.contains("civic")==true)
        {
        occ="civic";
        }if(tran.contains("politic")==true)
        {
        occ="politic";
        }
        if(tran.contains("politician")==true)
        {
        occ="politician";
        }
        if(tran.contains("profession")==true)
        {
        occ="profession";
        }
        if(tran.contains("internal")==true)
        {
        occ="internal";
        }
        if(tran.contains("constitutional")==true)
        {
        occ="constitutional";
        }
        if(tran.contains("economical")==true)
        {
        occ="economical";
        }
        if(tran.contains("federal")==true)
        {
        occ="federal";
        }
        if(tran.contains("adminstrative")==true)
        {
        occ="adminstrative";
        }
        if(tran.contains("factious")==true)
        {
        occ="factious";
        }
        if(tran.contains("factional")==true)
        {
        occ="factional";
        }
        if(tran.contains("adroit")==true)
        {
        occ="adroit";
        }
        if(tran.contains("artful")==true)
        {
        occ="artful";
        }
        if(tran.contains("circumspect")==true)
        {
        occ="circumspect";
        }if(tran.contains("diplomatic")==true)
        {
        occ="diplomatic";
        }if(tran.contains("discreet")==true)
        {
        occ="discreet";
        }if(tran.contains("politically")==true)
        {
        occ="politically";
        }if(tran.contains("politico")==true)
        {
        occ="politico";
        }if(tran.contains("judicious")==true)
        {
        occ="judicious";
        }if(tran.contains("policy")==true)
        {
        occ="policy";
        }if(tran.contains("campaign")==true)
        {
        occ="campaign";
        }if(tran.contains("policy-making")==true)
        {
        occ="policy-making";
        }if(tran.contains("parliamentary")==true)
        {
        occ="parliamentary";
        }if(tran.contains("absolute")==true)
        {
        occ="absolute";
        }if(tran.contains("statesmanlike")==true)
        {
        occ="statesmanlike";
        }if(tran.contains("aristocratic")==true)
        {
        occ="aristocratic";
        }if(tran.contains("pluralistic")==true)
        {
        occ="pluralistic";
        }if(tran.contains("patriarchal")==true)
        {
        occ="patriarchal";
        }if(tran.contains("fascist")==true)
        {
        occ="fascist";
        }if(tran.contains("despotic")==true)
        {
        occ="despotic";
        }if(tran.contains("monarchal")==true)
        {
        occ="monarchal";
        }if(tran.contains("monarchic")==true)
        {
        occ="monarchic";
        }if(tran.contains("autocratic")==true)
        {
        occ="autocratic";
        }if(tran.contains("previous")==true)
        {
        occ="previous";
        }if(tran.contains("autonomous")==true)
        {
        occ="autonomous";
        }if(tran.contains("democratic")==true)
        {
        occ="democratic";
        }if(tran.contains("federalist")==true)
        {
        occ="federalist";
        }if(tran.contains("monarchial")==true)
        {
        occ="monarchial";
        }if(tran.contains("monocratic")==true)
        {
        occ="monocratic";
        }if(tran.contains("oligarchal")==true)
        {
        occ="oligarchal";
        }if(tran.contains("republican")==true)
        {
        occ="republican";
        }if(tran.contains("suffragist")==true)
        {
        occ="suffragist";
        }if(tran.contains("theocratic")==true)
        {
        occ="theocratic";
        }if(tran.contains("dictatorial")==true)
        {
        occ="dictatorial";
        }if(tran.contains("matriarchal")==true)
        {
        occ="matriarchal";
        }if(tran.contains("matriarchic")==true)
        {
        occ="matriarchic";
        }if(tran.contains("monarchical")==true)
        {
        occ="monarchical";
        }if(tran.contains("patriarchic")==true)
        {
        occ="patriarchic";
        }if(tran.contains("federalistic")==true)
        {
        occ="federalistic";
        }
        if(tran.contains("federalistic")==true)
        {
        occ="federalistic";
        }
        if(tran.contains("geopolitical")==true)
        {
        occ="geopolitical";
        }
        if(tran.contains("heteronomous")==true)
        {
        occ="heteronomous";
        }
        if(tran.contains("totalitarian")==true)
        {
        occ="totalitarian";
        }
        if(tran.contains("authoritarian")==true)
        {
        occ="authoritarian";
        }
        if(tran.contains("gubernatorial")==true)
        {
        occ="gubernatorial";
        }
        if(tran.contains("politico-moral")==true)
        {
        occ="politico-moral";
        }if(tran.contains("self-governing")==true)
        {
        occ="self-governing";
        }if(tran.contains("politico-social")==true)
        {
        occ="politico-social";
        }if(tran.contains("parliamentarian")==true)
        {
        occ="parliamentarian";
        }if(tran.contains("politico-economic")==true)
        {
        occ="politico-economic";
        }if(tran.contains("politico-judicial")==true)
        {
        occ="politico-judicial";
        }if(tran.contains("politico-military")==true)
        {
        occ="politico-military";
        }if(tran.contains("politico")==true)
        {
        occ="politico";
        }if(tran.contains("judicial")==true)
        {
        occ="judicial";
        }if(tran.contains("social")==true)
        {
        occ="social";
        }if(tran.contains("economic")==true)
        {
        occ="economic";
        }if(tran.contains("military")==true)
        {
        occ="military";
        }if(tran.contains("politico-religious")==true)
        {
        occ="politico-religious";
        }if(tran.contains("religious")==true)
        {
        occ="religious";
        }if(tran.contains("politico-commercial")==true)
        {
        occ="politico-commercial";
        }if(tran.contains("politico-diplomatic")==true)
        {
        occ="politico-diplomatic";
        }if(tran.contains("politico-scientific")==true)
        {
        occ="politico-scientific";
        }if(tran.contains("politico-theological")==true)
        {
        occ="politico-theological";
        }if(tran.contains("theological")==true)
        {
        occ="theological";
        }if(tran.contains("politico-geographical")==true)
        {
        occ="politico-geographical";
        }
        if(tran.contains("geographical")==true)
        {
        occ="geographical";
        }
        if(tran.contains("countrywide")==true)
        {
        occ="countrywide";
        }
        if(tran.contains("nationwide")==true)
        {
        occ="nationwide";
        }
        if(tran.contains("bureaucratic")==true)
        {
        occ="bureaucratic";
        }if(tran.contains("legislative")==true)
        {
        occ="legislative";
        }if(tran.contains("prudent")==true)
        {
        occ="prudent";
        }if(tran.contains("chary")==true)
        {
        occ="chary";
        }if(tran.contains("expediant")==true)
        {
        occ="expediant";
        }if(tran.contains("election")==true)
        {
        occ="election";
        }if(tran.contains("direction")==true)
        {
        occ="direction";
        }if(tran.contains("economics")==true)
        {
        occ="economics";
        }if(tran.contains("economy")==true)
        {
        occ="economy";
        }if(tran.contains("housekeeping")==true)
        {
        occ="housekeeping";
        }if(tran.contains("housewifery")==true)
        {
        occ="housewifery";
        }if(tran.contains("husbandry")==true)
        {
        occ="husbandry";
        }if(tran.contains("management")==true)
        {
        occ="management";
        }if(tran.contains("news")==true)
        {
        occ="news";
        }if(tran.contains("media")==true)
        {
        occ="media";
        }if(tran.contains("police")==true)
        {
        occ="police";
        }if(tran.contains("strike")==true)
        {
        occ="strike";
        }if(tran.contains("trump")==true)
        {
        occ="trump";
        }if(tran.contains("bjp")==true)
        {
        occ="bjp";
        }if(tran.contains("fbi")==true)
        {
        occ="fbi";
        }if(tran.contains("hurricane")==true)
        {
        occ="hurricane";
        }if(tran.contains("rainfall")==true)
        {
        occ="rainfall";
        }if(tran.contains("breaking")==true)
        {
        occ="breaking";
        }
        
        
        
        
        status="News Tweets";
        mm.put(status, occ);
        }        
        else if(tran.contains("movie")||tran.contains("film")||tran.contains("oscar")||tran.contains("hero")||tran.contains("heroein")||tran.contains("songs")||tran.contains("villain")||tran.contains("shooting")||tran.contains("fans")||tran.contains("dance")||tran.contains("music")||tran.contains("choreography")||tran.contains("acting")||tran.contains("award")||tran.contains("stunt")||tran.contains("trailer")||tran.contains("release")||tran.contains("script")||tran.contains("promo")||tran.contains("star")||tran.contains("reviews")||tran.contains("animation")||tran.contains("sound")||tran.contains("superstar")||tran.contains("cinema")||tran.contains("bollywood")||tran.contains("kollywood")||tran.contains("tollywood")||tran.contains("flop")||tran.contains("classic")||tran.contains("music")||tran.contains("artists")||tran.contains("dubbing")||tran.contains("album")||tran.contains("tempo"))
        {
        if(tran.contains("movie")==true)
        {
        occ="movie";
        }
        if(tran.contains("film")==true)
        {
        occ="film";
        }
        if(tran.contains("oscar")==true)
        {
        occ="oscar";
        }
        if(tran.contains("hero")==true)
        {
        occ="hero";
        }
        if(tran.contains("heroein")==true)
        {
        occ="heroein";
        } 
	if(tran.contains("songs")==true)
        {
        occ="songs";
        }  
	if(tran.contains("villain")==true)
        {
        occ="villain";
        } 
	if(tran.contains("shooting")==true)
        {
        occ="shooting";
        } 
	if(tran.contains("fans")==true)
        {
        occ="fans";
        } 
	if(tran.contains("dance")==true)
        {
        occ="dance";
        } 
	if(tran.contains("music")==true)
        {
        occ="music";
        } 
	if(tran.contains("choreography")==true)
        {
        occ="choreography";
        }
        if(tran.contains("acting")==true)
        {
        occ="acting";
        }
        if(tran.contains("award")==true)
        {
        occ="award";
        }
        if(tran.contains("stunt")==true)
        {
        occ="stunt";
        }
        if(tran.contains("trailer")==true)
        {
        occ="trailer";
        }
        if(tran.contains("release")==true)
        {
        occ="release";
        }
        if(tran.contains("script")==true)
        {
        occ="script";
        }
        if(tran.contains("promo")==true)
        {
        occ="promo";
        }
        if(tran.contains("star")==true)
        {
        occ="star";
        }if(tran.contains("reviews")==true)
        {
        occ="reviews";
        }if(tran.contains("animation")==true)
        {
        occ="animation";
        }if(tran.contains("sound")==true)
        {
        occ="sound";
        }if(tran.contains("superstar")==true)
        {
        occ="superstar";
        }if(tran.contains("cinema")==true)
        {
        occ="cinema";
        }if(tran.contains("bollywood")==true)
        {
        occ="bollywood";
        }if(tran.contains("kollywood")==true)
        {
        occ="kollywood";
        }if(tran.contains("tollywod")==true)
        {
        occ="tollywod";
        }if(tran.contains("flop")==true)
        {
        occ="flop";
        }if(tran.contains("classic")==true)
        {
        occ="classic";
        }if(tran.contains("music")==true)
        {
        occ="music";
        }if(tran.contains("artists")==true)
        {
        occ="artists";
        }if(tran.contains("dubbing")==true)
        {
        occ="dubbing";
        }if(tran.contains("album")==true)
        {
        occ="album";
        }if(tran.contains("tempo")==true)
        {
        occ="tempo";
        }
        status+="Cinema";
        mm.put(status, occ);
        }
        else if(tran.contains("sports")||tran.contains("play")||tran.contains("football")||tran.contains("cricket")||tran.contains("badminton")||tran.contains("player")||tran.contains("tennis")||tran.contains("team")||tran.contains("premier")||tran.contains("league")||tran.contains("score")||tran.contains("athletics")||tran.contains("ball")||tran.contains("bowling")||tran.contains("batting")||tran.contains("soccer")||tran.contains("basketball")||tran.contains("gym")||tran.contains("skysports")||tran.contains("merit")||tran.contains("championship")||tran.contains("swimmer")||tran.contains("betting")||tran.contains("volley ball")||tran.contains("basket ball")||tran.contains("amphire"))
        {
        if(tran.contains("sports")==true)
        {
        occ="sports";
        }
        if(tran.contains("play")==true)
        {
        occ="play";
        }
        if(tran.contains("football")==true)
        {
        occ="football";
        }
        if(tran.contains("cricket")==true)
        {
        occ="cricket";
        }
        if(tran.contains("badminton")==true)
        {
        occ="badminton";
        } 
	if(tran.contains("player")==true)
        {
        occ="player";
        }  
	if(tran.contains("tennis")==true)
        {
        occ="tennis";
        } 
	if(tran.contains("team")==true)
        {
        occ="team";
        } 
	if(tran.contains("premier")==true)
        {
        occ="premier";
        } 
	if(tran.contains("league")==true)
        {
        occ="league";
        } 
	if(tran.contains("score")==true)
        {
        occ="score";
        } 
	if(tran.contains("athletics")==true)
        {
        occ="athletics";
        }
        if(tran.contains("ball")==true)
        {
        occ="ball";
        }
        if(tran.contains("bowling")==true)
        {
        occ="bowling";
        }
        if(tran.contains("batting")==true)
        {
        occ="batting";
        }
        if(tran.contains("soccer")==true)
        {
        occ="soccer";
        }
        if(tran.contains("basketball")==true)
        {
        occ="basketball";
        }
        if(tran.contains("gym")==true)
        {
        occ="gym";
        }
        if(tran.contains("skysports")==true)
        {
        occ="skysports";
        }
        if(tran.contains("merit")==true)
        {
        occ="merit";
        }if(tran.contains("championship")==true)
        {
        occ="championship";
        }if(tran.contains("swimmer")==true)
        {
        occ="swimmer";
        }if(tran.contains("betting")==true)
        {
        occ="betting";
        }if(tran.contains("volley ball")==true)
        {
        occ="volley ball";
        }if(tran.contains("basket ball")==true)
        {
        occ="basket ball";
        }if(tran.contains("amphire")==true)
        {
        occ="amphire";
        }
        status+="Sports";
        mm.put(status, occ);
        }
        
        else
        {
        String arr[]=tran.split(" "); 
            for(String key:arr)
            {        
            occ+=key;
            break;
            }
            status+="Others";
            mm.put(status, occ);
            System.out.println(mm.values());
        }
        return mm;  
        
    }
    public static void main(String[] args) {
        Classifer  ccc = new Classifer();
        Map <String, String> status = ccc.data("Nah I swimmer think he betting to usf, he lives around here though");
        System.out.println(status);
       
            Set<String> setob = status.keySet();
            Collection col = status.values();
            String sta = setob.toString(); 
            String col1 = col.toString(); 
            sta=sta.replaceAll("[^a-zA-Z0-9]", "");
            col1=col1.replaceAll("[^a-zA-Z0-9]", "");
                System.out.println(sta);
                System.out.println(col1);
               
    }
}
