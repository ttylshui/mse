package com.jg.mes.controller;

import com.jg.mes.domain.Video;
import com.jg.mes.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: jg.yu
 * @Date: 2020/12/31 - 12 - 31 - 15:59
 * @Description: com.jg.mes.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    private final VideoService videoService;
    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("videos")
    public Object videos(){
        List<Video> videos = videoService.videos();
        return videos;
    }

}
