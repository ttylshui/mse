package com.jg.mes.service.impl;

import com.jg.mes.domain.Video;
import com.jg.mes.mapper.VideoMapper;
import com.jg.mes.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: JG.Yu
 * @Date: 2021/1/5 0005 - 01 - 05 - 下午 8:08
 * @Description: com.jg.mes.service.impl
 * @version: 1.0
 */
@Service
public class VideoServiceImpl implements VideoService {
    private final VideoMapper videoMapper;
    @Autowired
    public VideoServiceImpl(VideoMapper videoMapper) {
        this.videoMapper = videoMapper;
    }

    @Override
    public List<Video> videos() {
        return videoMapper.videoList();
    }
}
