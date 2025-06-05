package com.damai.controller;

import com.damai.common.ApiResponse;
import com.damai.dto.TicketUserDto;
import com.damai.dto.TicketUserIdDto;
import com.damai.dto.TicketUserListDto;
import com.damai.service.TicketUserService;
import com.damai.vo.TicketUserVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: damai
 * @description: 购票人 控制层
 * @author: yangsen
 **/
@RestController
@RequestMapping("/ticket/user")
@Tag(name = "ticket-user", description = "购票人")
public class TicketUserController {
    
    @Autowired
    private TicketUserService ticketUserService;
    
    @Operation(summary  = "查询购票人列表")
    @PostMapping(value = "/list")
    public ApiResponse<List<TicketUserVo>> list(@Valid @RequestBody TicketUserListDto ticketUserListDto){
        return ApiResponse.ok(ticketUserService.list(ticketUserListDto));
    }
//
//    @Operation(summary  = "添加购票人")
//    @PostMapping(value = "/add")
//    public ApiResponse<Void> add(@Valid @RequestBody TicketUserDto ticketUserDto){
//        ticketUserService.add(ticketUserDto);
//        return ApiResponse.ok();
//    }
//
//    @Operation(summary  = "删除购票人")
//    @PostMapping(value = "/delete")
//    public ApiResponse<Void> delete(@Valid @RequestBody TicketUserIdDto ticketUserIdDto){
//        ticketUserService.delete(ticketUserIdDto);
//        return ApiResponse.ok();
//    }
}
