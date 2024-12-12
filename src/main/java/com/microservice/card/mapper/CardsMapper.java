package com.microservice.card.mapper;

import com.microservice.card.dto.CardDTO;
import com.microservice.card.entity.Card;

public class CardsMapper {

    public static CardDTO mapToCardsDto(Card card, CardDTO cardDTO) {
        cardDTO.setCardNumber(card.getCardNumber());
        cardDTO.setCardType(card.getCardType());
        cardDTO.setMobileNumber(card.getMobileNumber());
        cardDTO.setTotalLimit(card.getTotalLimit());
        cardDTO.setAvailableAmount(card.getAvailableAmount());
        cardDTO.setAmountUsed(card.getAmountUsed());
        return cardDTO;
    }

    public static Card mapToCards(CardDTO cardDTO, Card card) {
        card.setCardNumber(cardDTO.getCardNumber());
        card.setCardType(cardDTO.getCardType());
        card.setMobileNumber(cardDTO.getMobileNumber());
        card.setTotalLimit(cardDTO.getTotalLimit());
        card.setAvailableAmount(cardDTO.getAvailableAmount());
        card.setAmountUsed(cardDTO.getAmountUsed());
        return card;
    }

}
