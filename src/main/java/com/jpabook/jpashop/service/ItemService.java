package com.jpabook.jpashop.service;

import com.jpabook.jpashop.domain.item.Item;
import com.jpabook.jpashop.repository.ItemRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    public List<Item> findItems(Long id) {
        return itemRepository.findAll();
    }

    public Optional<Item> findOne(Long itemId) {
        return itemRepository.findById(itemId);
    }

    @Transactional
    public void updateItem(Long id, String name, int price, int stockQuantity) {
        Item item = itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("아아"));
        item.setName(name);
        item.setPrice(price);
        item.setStockQuantity(stockQuantity);
    }
    public List<Item> findItems() {
        return itemRepository.findAll();
    }
}
