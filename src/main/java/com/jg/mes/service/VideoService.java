package com.jg.mes.service;

import com.jg.mes.domain.Video;

import java.util.List;

/**
 * @author: JG.Yu
 * @Date: 2021/1/5 0005 - 01 - 05 - 下午 8:03
 * @Description: com.jg.mes.service
 * @version: 1.0
 */
public interface VideoService {
    /**
     * 返回Video列表
     * @return video列表
     *
     */
    public List<Video> videos();
}
