package fii.practic.health.control.service;

import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {

    @Override
    public int computeSum(int x, int y) {
        return x + y;
    }
}
