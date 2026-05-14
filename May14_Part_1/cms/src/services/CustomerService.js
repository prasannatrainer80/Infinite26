import axios from "axios"

const CustomerService = () => {

    const showCustomerPendingOrders = async (custId) => {
        try {
            const response = await axios.get(
                "http://localhost:9992/showCustomerPendingOrder/" + custId
            );

            return response.data;

        } catch (error) {
            console.log(error);
            return null;
        }
    }
    
    const showCustomerOrders = async (custId) => {
        try {
            const response = await axios.get(
                "http://localhost:9992/showCustomerOrder/" + custId
            );

            return response.data;

        } catch (error) {
            console.log(error);
            return null;
        }
    }

    const showCustomerWallet = async (custId) => {
        try {
            const response = await axios.get(
                "http://localhost:9992/showCustomerWallets/" + custId
            );

            return response.data;

        } catch (error) {
            console.log(error);
            return null;
        }
    }
     const searchByCustomerUserName = async (user) => {
        try {
            const response = await axios.get(
                "http://localhost:9992/customer/searchByCustomerUserName/" + user
            );

            return response.data;

        } catch (error) {
            console.log(error);
            return null;
        }
    };

    const login = async (user, pwd) => {
        try {
            const response = await axios.get(
                `http://localhost:9992/customer/customerLogin/${user}/${pwd}`
            );

            return response.data; // returns 0 or 1
        } catch (error) {
            console.log(error);
            return null;
        }
    };

    return {
        login,
        searchByCustomerUserName,
        showCustomerWallet,
        showCustomerOrders,
        showCustomerPendingOrders
    };
};

export default CustomerService;