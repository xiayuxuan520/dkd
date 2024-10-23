package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Node;
import com.dkd.manage.domain.Partner;
import com.dkd.manage.domain.Region;
import lombok.Data;

@Data
public class NodeVO extends Node {
    /**
    * 节点区域名称
     */
    private Region region;
    /**
     * 节点区域名称
     */
    private Partner partner;
    /**
     * 设备数量
     */
    private Integer vmCount;
}
