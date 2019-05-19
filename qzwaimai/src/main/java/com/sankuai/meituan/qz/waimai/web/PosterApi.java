package com.sankuai.meituan.qz.waimai.web;

import com.sankuai.meituan.qz.waimai.domain.WmPoster;
import com.sankuai.meituan.qz.waimai.service.PosterService;
import com.sankuai.meituan.qz.waimai.util.ResponseUtil;
import com.sankuai.meituan.qz.waimai.vo.PagingQueryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/poster")
public class PosterApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(PosterApi.class);

    @Autowired
    private PosterService posterService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Object getPosters() {
        PagingQueryResult<WmPoster> result;
        try {
            result = posterService.getPosters();
        } catch (Exception e) {
            LOGGER.warn("PosterApi.getPosters error", e);
            return ResponseUtil.respErrOf("");
        }
        return ResponseUtil.respSuccessOf(result);

    }

}
