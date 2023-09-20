package com.example.test_fragment;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import androidx.fragment.app.Fragment;

public class ContentFrag extends Fragment {
    GridView gridview;
    ImageAdapter imageAdapter;

    // Define data arrays for each menu
    String[] flowersData = {"https://bizweb.dktcdn.net/thumb/1024x1024/100/347/446/products/bo-hoa-tulip-mau-trang-don-gian-tinh-te-18-bong.jpg?v=1680143276963","https://hoatuoi360.vn/uploads/file/Hoa%20tulip/hoa-tulip-hong-hoatuoi360-02.jpg","https://bizweb.dktcdn.net/100/447/644/products/vn-11134207-7qukw-lhx903a4ur9h98-1686905373473.jpg?v=1686905764783"};
    String[] animalsData = {"https://cdn.tgdd.vn/Files/2022/11/29/1491554/meo-bengal-nguon-goc-dac-diem-cach-nuoi-gia-ban-202211290658404954.jpg", "https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2020/6/30/816260/Cho-1.jpg", "https://huanluyencho119.vn/uploads/dowloads/cach-huan-luyen-cho-phat-mot-chu-cho-khi-lam-sai-lieu-co-hieu-qua-nhu-mong-doi/cach-huan-luyen-cho-phat-mot-chu-cho-khi-lam-sai-lieu-co-hieu-qua-nhu-mong-doi.jpg"};
    String[] foodsData = {"https://lh4.googleusercontent.com/xwjRmIlp5MbQ_eJzKQgpsweD7a-2NDntk-FwZkrYMWdEBEvlgiIl8y7zv3HZOVjPMnsehKaMZhSnP3fB7E9Cb_kiHW4-hqNsNlPJTkpdOSqtlma0Q-X5JuWw7oCdAhaa7KRsmBs", "https://cdn.tgdd.vn/Files/2022/01/25/1412805/cach-nau-pho-bo-nam-dinh-chuan-vi-thom-ngon-nhu-hang-quan-202201250230038502.jpg", "https://cdn.tgdd.vn/Files/2021/08/09/1373996/tu-lam-com-tam-suon-trung-don-gian-thom-ngon-nhu-ngoai-hang-202201071248422991.jpg"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_frag, container, false);
        gridview = view.findViewById(R.id.gridview);
        return view;
    }

    public void updateContent(int position) {
        switch (position) {
            case 0:
                imageAdapter =new ImageAdapter(flowersData,requireContext());
                break;
            case 1:
                imageAdapter =new ImageAdapter(animalsData,requireContext());
                break;
            case 2:
                imageAdapter =new ImageAdapter(foodsData,requireContext());
                break;
        }

        gridview.setAdapter(imageAdapter);
    }
}





