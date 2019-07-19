package com.lls.i18n.controller;

import com.lls.i18n.I18nDTO;
import com.lls.i18n.config.PageResult;
import com.lls.i18n.config.Result;
import com.lls.i18n.model.I18nDO;
import com.lls.i18n.service.I18nService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/************************************
 * I18nController
 * @author liliangshan
 * @date 2019-07-18
 ************************************/
@RestController
@RequestMapping("/v1/i18n")
public class I18nController {

    private final I18nService i18nService;

    @Autowired
    public I18nController(I18nService i18nService) {
        this.i18nService = i18nService;
    }

    @GetMapping
    public PageResult<I18nDO> listAll(@RequestParam(value = "name", required = false) String name,
                                      @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                      @RequestParam(value = "size", required = false, defaultValue = "10") int size) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("name", name);
        params.put("page", page);
        params.put("size", size);
        long total = i18nService.getTotal(params);
        List<I18nDO> data = i18nService.listAll(params);
        PageResult<I18nDO> result = new PageResult<>(data);
        result.setPage(page);
        result.setSize(size);
        result.setTotal(total);
        return result;
    }

    @PostMapping
    public Result<Long> save(@RequestBody I18nDTO i18nDO) {
        long id = i18nService.save(i18nDO.toDO());
        return new Result<>(id);
    }

    @GetMapping("/{id}")
    public Result<I18nDO> getItem(@PathVariable("id") long id) {
        return new Result<>(i18nService.getItem(id));
    }

    @GetMapping("/description")
    public Result<String> getDescription() {
        return new Result<>(i18nService.getDescription());
    }

}
