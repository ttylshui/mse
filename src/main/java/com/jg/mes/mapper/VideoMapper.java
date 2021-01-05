package com.jg.mes.mapper;

import com.jg.mes.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: JG.Yu
 * @Date: 2021/1/5 0005 - 01 - 05 - 下午 7:50
 * @Description: com.jg.mes.mapper
 * @version: 1.0
 */
@Repository
public class VideoMapper {
    private static Map<Integer, Video> videoMap = new HashMap<>();
    static {
        videoMap.put(1,new Video(1,"java初步学习！"));
        videoMap.put(2,new Video(2,"java中等技术"));
        videoMap.put(3,new Video(3,"java高级学问"));
    }

    public List<Video> videoList(){
        List<Video> videoList = new ArrayList<>();
        videoList.addAll(videoMap.values());
        return videoList;
    }
}
