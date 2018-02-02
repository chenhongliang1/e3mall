package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import yycg.base.pojo.TbItem;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	public TbItemMapper itemMapper;
	public TbItem findItemById(Long itemId) {
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		return item;
	}

}
